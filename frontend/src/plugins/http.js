import axios from 'axios'

const HTTP = axios.create({
  baseURL: `http://localhost:8080`,
  headers: {
    Authorization: 'Bearer {token}'
  }
})

export default HTTP
