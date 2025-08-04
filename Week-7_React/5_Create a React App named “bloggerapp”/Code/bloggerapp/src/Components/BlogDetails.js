import React from 'react'
import { blogs } from './data'

const BlogDetails = () => {
  return (
    <div>
      {blogs.map((item) => {
        return(
          <div key={item.id}>
            <h2>{item.title}</h2>
            <h3>{item.author}</h3>
            <p>{item.details}</p>
          </div>
        )
      })}
    </div>
  )
}

export default BlogDetails