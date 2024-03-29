import React, { useState } from "react";
import EmployeeService from "../services/EmployeeService";
import { useNavigate } from "react-router-dom";

const AddEmployee = () => {

    const [employee, setemployee] = useState({
        id:"",
        firstName:"",
        lastName:"" ,
        emailId:"", 
    });


    const navigaye = useNavigate();

    const handleChange = (e) => {
        const value = e.target.value;
        setemployee({...employee,[e.target.name]:value});
    };
    const saveEmployee = (e) => {
        e.preventDefault();
        EmployeeService.saveEmployee(employee)
        .then((response)=>{
            console.log(response);
            navigaye("/employeeList");
        })
        .catch((error)=> {
            console.log(error);
        });
    };

    const reset = (e) => {
        e.preventDefault();
        setemployee({
          id: "",
          firstName: "",
          lastName: "",
          emailId: "",
        });
      };
    
        

    return (
    <div className="flex max-2xl mx-auto shadow border-b ">
        <div className="px-8 py-8">
            <div className="font-thin text-2xl tracking-wider">
                <h1>Add New Employee</h1> 
                </div>
                <div className="items-center justify-center h-14 w-full my-4">
                 <label className="block text-gray-600 text -sm font-normal">
                    First Name
                    </label>
                 <input 
                 type="text"
                  name="firstName"
                  value={employee.firstName}
                  onChange={(e)=> handleChange(e)}
                 className="h-10 w-96 border mt-2 px-2 py-2"></input>
                </div>
                <div className="items-center justify-center h-14 w-full my-4">
                 <label className="block text-gray-600 text -sm font-normal">
                    Last Name
                    </label>
                 <input 
                 type="text"
                 name="lastName"
                 value={employee.lastName}
                 onChange={(e)=> handleChange(e)}
                 className="h-10 w-96 border mt-2 px-2 py-2"></input>
                 </div>
                 <div className="items-center justify-center h-14 w-full my-4">
                 <label className="block text-gray-600 text -sm font-normal">
                    Email
                    </label>
                 <input 
                 type="email"
                 name="emailId"
                 value={employee.emailId}
                 onChange={(e)=> handleChange(e)}
                 className="h-10 w-96 border mt-2 px-2 py-2"></input>
                </div>

                <div className="items-center justify-center h-14 w-full my-4 space-x-4">
                    <button onClick={saveEmployee} 
                    className="rounded text-white front-semibold bg-green-400 hover:bg-green py-2 px-6">
                        Save
                    </button>
                    <button 
                    onClick={reset}
                    className="rounded text-white front-semibold bg-red-400 hover:bg-green py-2 px-6">
                        Clear
                    </button>
                </div>
            </div>
    </div>
    );
};
  
export default AddEmployee;