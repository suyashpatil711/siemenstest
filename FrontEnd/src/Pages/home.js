import { useEffect,useState } from "react";
import axios from "axios";


const Home = () => {
    // private int qty;
	// private String material;
	// private int length;
	// private int dia;
    const [qty,setQty]=useState('')
    const [material,setMaterial]=useState('')
    const [length,setLength]=useState('')
    const [dia,setDia]=useState('')

    const getData = () => {
        const url = `http://localhost:8080/userdata`
        // send the GET request
        const body={
            qty : qty,
            length : length,
            material: material,
            dia: dia
        }
        axios.post(url,body).then((response) => {
          const result = response.data
          console.log(result)

        })

    
   
    }
    // useEffect(() => {
    //     getData()
        
    //   }, [])

    return(
    <div>

<div >
                <label htmlFor="" className="label-control">
                 qty
                </label>
                <input
                  onChange={(e) => {
                    setQty(e.target.value)
                  }}
                  type="text"
                  className="form-control"
                />
              </div>


              <div className="mb-3">
                <label htmlFor="" className="label-control">
                 material
                </label>
                <input
                  onChange={(e) => {
                    setMaterial(e.target.value)
                  }}
                  type="text"
                  className="form-control"
                />
              </div>

              <div className="mb-3">
                <label htmlFor="" className="label-control">
                 length
                </label>
                <input
                  onChange={(e) => {
                    setLength(e.target.value)
                  }}
                  type="text"
                  className="form-control"
                />
              </div>

              <div className="mb-3">
                <label htmlFor="" className="label-control">
                 dia
                </label>
                <input
                  onChange={(e) => {
                    setDia(e.target.value)
                  }}
                  type="text"
                  className="form-control"
                />
              </div>






              <button onClick={getData} className="btn btn-primary">
                  Signin
                </button>

    </div>
)
    }

export default Home;