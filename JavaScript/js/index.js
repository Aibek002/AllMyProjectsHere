import { model } from "./model"
import { title,text,columns } from "./templates"


const $site = document.body.querySelector('#site')

model.forEach(block => {
  let html=""
  if(block.type==='title'){
   html=title(block)
  }else if(block.type==='text'){
   html=text(block)
  }else if(block.type==='columns'){
   html=columns(block)
  }
      $site.insertAdjacentHTML('beforeend', html);
   
})

