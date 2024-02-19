package kr.co.mbrain.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    
@Data
@NoArgsConstructor
@Builder
public class DataVo {
    private String id;
    private String name;
    private String password;
    public DataVo(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    

    
}
