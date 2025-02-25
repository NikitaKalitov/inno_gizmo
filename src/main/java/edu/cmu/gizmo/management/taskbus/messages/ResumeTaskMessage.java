/*
 * ResumeTaskMessage.java Jul 10, 2012 1.0
 */
package edu.cmu.gizmo.management.taskbus.messages;


/**
 * The Class ResumeTaskMessage.
 */
public class ResumeTaskMessage implements TaskMessage {

	/** The task id. */
	private Integer taskId;
	
	/** The capability id. */
	private Integer capabilityId;
	
	/**
	 * Instantiates a new resume task message.
	 *
	 * @param tid the tid
	 * @param cid the cid
	 */
	public ResumeTaskMessage(Integer tid, Integer cid)  {
		taskId = tid;
		capabilityId = cid;
	}
	
	/**
	 * Gets the task id.
	 *
	 * @return the task id
	 */
	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * Gets the capability id.
	 *
	 * @return the capability id
	 */
	public Integer getCapabilityId() {
		return capabilityId;
	}
	
	/* (non-Javadoc)
	 * @see edu.cmu.gizmo.management.taskbus.messages.TaskMessage#getMessageType()
	 */
	@Override
	public String getMessageType() {
		return TaskMessage.RESUME_TASK;
	}
}
