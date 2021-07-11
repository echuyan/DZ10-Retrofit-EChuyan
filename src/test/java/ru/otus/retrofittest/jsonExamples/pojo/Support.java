
package ru.otus.retrofittest.jsonExamples.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
@Builder
@SuppressWarnings("unused")
public class Support {

    private String text;
    private String url;

}
