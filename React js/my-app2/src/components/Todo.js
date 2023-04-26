import {useState} from "react";

import Backdrop from "./Backdrop";
import Modal from  "./Modal";

function Todo(props){
     const[ ModalIsOpen, SetModalIsOpen ] = useState(false);

      function deleteHandler(){
            SetModalIsOpen(true);
            
      }
      function closeHandler(){
            SetModalIsOpen(false);
      }
      
      return (
    
      <div className="card">
        <h2> {props.text} </h2>
         <div className="actions">
         <button className="btn" onClick={deleteHandler}> 
         DELETE 
         </button>

         {/* onClick delete handler will call that function and will run that part */}
         </div> 

{/* if MOdolIsOpen is true then it will render Modal component, if both(ModalIsOpen,Modal) are true then it will  return the output if ModalIsOpen is false it will give iutput null */}
{/* if MOdolIsOpen is true then it will render Backdrop component if both (ModalIsOpen,backdrop) are true then it will return the output if ModalIsOpen is false it will give iutput null */}
{/* below both lines logic is same but writting in different ways */}
       
         {ModalIsOpen ? <Modal/> :null }              
         {ModalIsOpen && <Backdrop onClick= {closeHandler} /> }

      </div> 
    
);    
} 
export default Todo;