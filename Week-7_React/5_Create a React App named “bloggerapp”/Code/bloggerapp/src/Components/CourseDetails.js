import React from 'react'
import {courses} from "./data"

const CourseDetails = () => {
  return (
    <div>
      {courses.map((item) => {
        return(
          <div key={item.id}>
            <h2>{item.cname}</h2>
            <p>{item.start_date}</p>
          </div>
        )
      })}
    </div>
  )
}

export default CourseDetails