import { useState } from "react";
import "./App.css";
import BlogDetails from "./Components/BlogDetails";
import BookDetails from "./Components/BookDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {
  const [choice, setChoice] = useState("courses");
  const [activeBtn, setActiveBtn] = useState("courses");

  const handleCourseView = (e) => {
    e.preventDefault();
    setChoice("courses");
    setActiveBtn("courses");
  };

  const handleBlogView = (e) => {
    e.preventDefault();
    setChoice("blogs");
    setActiveBtn("blogs");
  };

  const handleBookView = (e) => {
    e.preventDefault();
    setChoice("books");
    setActiveBtn("books");
  };

  function renderComponents() {
    if (choice === "blogs") {
      return (
        <>
          <div className="content">
            <h1>Blog Details</h1>
            <BlogDetails />
          </div>
        </>
      );
    }
    if (choice === "books") {
      return (
        <>
          <div className="content">
            <h1>Book Details</h1>
            <BookDetails />
          </div>
        </>
      );
    }
  }

  return (
    <div className="container">
      <h1>Welcome to BlogApp</h1>
      <div className="btn-container">
        <button onClick={handleCourseView} disabled={activeBtn === "courses"}>
          View Corese Details
        </button>
        <button onClick={handleBlogView} disabled={activeBtn === "blogs"}>
          View Blogs
        </button>
        <button onClick={handleBookView} disabled={activeBtn === "books"}>
          View Books
        </button>
      </div>

      {choice === "courses" ? (
        <>
          <div className="content">
            <h1>Course Details</h1>
            <CourseDetails />
          </div>
        </>
      ) : (
        <>{renderComponents()}</>
      )}
    </div>
  );
}

export default App;
