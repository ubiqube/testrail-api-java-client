package com.codepine.api.testrail.model;

import com.codepine.api.testrail.TestRail;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * TestRail section.
 */
@Data
public class Section {

    private int id;

    @JsonView({TestRail.Sections.Add.class, TestRail.Sections.Update.class})
    private String name;

    @JsonView(TestRail.Sections.Add.class)
    private int suiteId;

    @JsonView(TestRail.Sections.Add.class)
    private int parentId;

    private int depth;

    private int displayOrder;

}
