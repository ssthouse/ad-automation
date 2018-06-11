export default class DownloadTask {
  constructor(startDate, endDate, runTime, description, creater, taskId) {
    this.startDate = startDate || new Date()
    this.endDate = endDate || new Date()
    this.runTime = runTime || ''
    this.description = description || ''
    this.creater = creater || ''
    this.taskId = taskId || ''
  }

  toString() {
    return `start date: ${this.startDate}
    end date: ${this.endDate}
    desc: ${this.description}`
  }
}
