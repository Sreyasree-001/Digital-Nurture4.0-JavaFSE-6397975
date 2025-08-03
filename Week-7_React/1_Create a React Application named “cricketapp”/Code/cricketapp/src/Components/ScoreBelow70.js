import React from 'react'

const ScoreBelow70 = ({players}) => {
const players70 = players.filter(player => player.score < 70);
  return (
    <div>
       {players70.map((item) => {
        return(
            <div key={item.name}>
            <li>
               Mr. {item.name}
              <span> {item.score}</span>
            </li>
          </div>
        )
       })}
      </div>
  )
}

export default ScoreBelow70