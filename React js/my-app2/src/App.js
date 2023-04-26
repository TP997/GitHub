import Todo from "./components/Todo";

function App() {
  return (
    <div>
      <h1> My Todos </h1>

       <Todo  text="learn rect"/>                                 {/* callin the Todo component */}
       <Todo  text= "master react" />
       <Todo  text ="explore full course" />
       </div>
  );
}

export default App;
