package cn.eros.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>create time：2021-08-13 16:43
 *
 * @author Eros
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentFlow {
    private Integer nodeId;
    private Integer documentId;
    private Integer flowState;
}
