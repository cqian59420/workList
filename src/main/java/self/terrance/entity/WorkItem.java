package self.terrance.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by cq on 2017/3/16.
 */
@Getter
@Setter
@NoArgsConstructor
public class WorkItem {


    private Long workId;

    private String workTitle;//title

    private LocalDateTime createDateTime;//创建日期

    private String workItemDetailInfo;


}
