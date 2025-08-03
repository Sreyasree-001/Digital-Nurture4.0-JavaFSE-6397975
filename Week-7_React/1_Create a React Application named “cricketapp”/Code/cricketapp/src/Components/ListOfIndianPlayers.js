import React from 'react'

const ListOfIndianPlayers = ({IndianPlayers}) => {
    
  return (
    <div>
      {IndianPlayers.map((item) => {
        return(
          <div key={item}>
            <li> Mr. {item}</li>
            </div>
        )
      })}
    </div>
  )
}

export default ListOfIndianPlayers