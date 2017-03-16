package self.terrance.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.time.LocalDateTime;

/**
 * Created by cq on 2017/3/16.
 */
@Getter
@Setter
public class WorkItem {


    private Long workId;

    private String workTitle;//title

    private LocalDateTime createDateTime;//创建日期

    private String workItemDetailInfo;


}
