package DesignPattern.Builder;

public class Student {
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder mb){
        //do your validations here
        this.content = mb.getContent();
        this.sender = mb.getSender();
        this.recipient = mb.getRecipient();
        this.isDelivered = mb.isDelivered();
        this.timestamp = mb.getTimestamp();
    }




    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public long getTimestamp() {
        return timestamp;
    }

      public static class Builder {
          private String content;
          private String sender;
          private String recipient;
          private boolean isDelivered;
          private long timestamp;


          public Student build() {
              //validations
              return new Student(this);
          }

          public String getContent() {
              return content;
          }

          public Builder setContent(String c) {
              this.content = c;
              return this;
          }

          public Builder setSender(String s) {
              this.sender = s;
              return this;
          }

          public String getSender() {
              return sender;
          }

          public Builder setRecipient(String r) {
              this.recipient = r;
              return this;
          }

          public String getRecipient() {
              return recipient;
          }

          public Builder setIsDelivered(boolean d) {
              this.isDelivered = d;
              return this;
          }

          public boolean isDelivered() {
              return isDelivered;
          }

          public Builder setTimestamp(long t) {
              this.timestamp = t;
              return this;
          }

          public long getTimestamp() {
              return timestamp;
          }
      }
}
