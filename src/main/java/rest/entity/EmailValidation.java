package rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "emailvalidationsign")
public class EmailValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "E_ID")
    private long id;

    @Column(name = "fro_m")
    private String from;

    @Column(name = "reply_to")
    private String reply_to;

    @Column(name = "t_o")
    private String to;

    @Column(name = "c_c")
    private String cc;

    @Column(name = "bc_c")
    private String bcc;

    @Column(name = "subjec_t")
    private String subject;

    @ManyToOne(optional = false)
    @JoinColumn(name= "C_ID")
    private ContentJson content;


    public ContentJson getContent() {
        return content;
    }

    public void setContent(ContentJson content) {
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getReply_to() {
        return reply_to;
    }

    public void setReply_to(String reply_to) {
        this.reply_to = reply_to;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}

