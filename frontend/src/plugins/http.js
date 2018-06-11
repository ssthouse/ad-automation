import axios from 'axios'

const baseURL = process.env.ROOT_API
const HTTP = axios.create({
  baseURL,
  headers: {
    Authorization: 'Bearer {token}'
  }
})

export default HTTP
