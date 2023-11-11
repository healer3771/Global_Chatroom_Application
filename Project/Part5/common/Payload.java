package Project.Part5.common;
import java.io.Serializable;
    //Qadeer Ahmad
    //Ucid: qa9
    //Date: 11/13/2023
 // Represents a payload object that can be sent between client and server. 
public class Payload implements Serializable {
    private static final long serialVersionUID = 1L;
    
    //The type of processing to perform on the payload.
    private PayloadType payloadType;
     /* Gets the payload type.
     * @return the payload type
     */
    public PayloadType getPayloadType() {
        return payloadType;
    }
     /* Sets the payload type.
     * @param payloadType the type of processing */
    public void setPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType;
    }
     /* The name of the client sending the payload. */
    private String clientName;
     /* Gets the client name.
     * @return the client name*/
    public String getClientName() {
        return clientName;
    }
     /* Sets the client name.
     * @param clientName the client name*/
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
     /* The client ID sending the payload.*/
    private long clientId;
     /* Gets the client ID.
     * @return the client ID */
    public long getClientId() {
        return clientId;
    }
     /* Sets the client ID.
     * @param clientId the client ID */ 
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
     /* A generic text message.*/
    private String message;
     /* Gets the message text.
     * @return the message text */
    public String getMessage() {
        return message;
    }
     /* Sets the message text.
     * @param message the message text */
    public void setMessage(String message) {
        this.message = message; 
    }
     /* Returns a string representation of the payload.*/
    @Override
    public String toString() {
        return String.format("Type[%s],ClientId[%s,] ClientName[%s], Message[%s]", getPayloadType().toString(),
                getClientId(), getClientName(),
                getMessage());
    }
}