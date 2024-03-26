
import './App.css'
import "bootstrap/dist/css/bootstrap.min.css"
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom'
import Home from '../Component/Home'
import QuizStepper from '../Component/quiz/QuizStepper'
import Quiz from '../Component/quiz/Quiz'
import QuizResult from '../Component/quiz/QuizResult'
import GetAllQuiz from '../Component/quiz/GetAllQuiz'
import AddQuestion from '../Component/question/AddQuestion'
import UpdateQuestion from '../Component/question/UpdateQuestion'
import Navbar from '../Component/layout/Navbar'
import Admin from '../Component/Admin'

function App() {
  

  return (
    <main className="container mt-5 mb-5">
			<Router>
				<Navbar />
				<Routes>
					<Route path="/" element={<Home />} />
					<Route path="/quiz-stepper" element={<QuizStepper />} />					
					<Route path="/admin" element={<Admin />} />
					<Route path='/take-quiz' element={<Quiz/>} />
					<Route path="/create-quiz" element={<AddQuestion />} />
					<Route path="/update-quiz/:id" element={<UpdateQuestion />} />
					<Route path="/all-quizzes" element={<GetAllQuiz />} />
					<Route path="/quiz-result" element={<QuizResult />} />
				</Routes>
			</Router>
		</main>
  )
}

export default App
