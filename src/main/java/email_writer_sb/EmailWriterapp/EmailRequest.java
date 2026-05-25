package email_writer_sb.EmailWriterapp;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
