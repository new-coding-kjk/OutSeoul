package com.howthere.app.entity.file;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "TBL_ANNOUNCE_FILE")
@Getter @ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnnounceFile extends FileEntity {
    //@ManyToOne(fetch = FetchType.LAZY)
    //private Announce announce;
}
