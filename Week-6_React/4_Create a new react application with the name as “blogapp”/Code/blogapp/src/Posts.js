import { Component } from "react";
import Post from './Post';


export class Posts extends Component{
    constructor(props){
        super(props);
        this.state = {
            posts: []
        }
    }

    loadPosts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(response => response.json())
        .then(data => {
            const posts = data.map(post => new Post(post.id, post.title, post.body));

            this.setState({posts});
        })
        .catch(error => {
            console.log(error);
        })
    }

    componentDidMount(){
        this.loadPosts();
    }

    render(){
        return(
            <>
            <div>
                <h2>--List of all posts--</h2>
                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h3>Post no: {post.id}</h3>
                        <h3>Title: {post.title}</h3>
                        <p>Post: {post.body}</p>
                        <br/>
                    </div>
                ))}
            </div>
            </>
        )
    }

    componentDidCatch(error, info){
        alert("Error Rendering Component: ",error);

        console.log("Error: ",error);
        console.log("Information: ",info);

    }
}

//export default Posts