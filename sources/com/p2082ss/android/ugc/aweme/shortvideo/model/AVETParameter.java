package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVETParameter */
public final class AVETParameter implements Serializable {
    private String contentSource = "shoot";
    private String contentType = "video";
    private String creationId = "";
    private int draftId;
    private String newDraftId = "";
    private int original = -1;
    private int shootMode;
    private String shootWay = "";
    private String storySceneId = "";
    private String storyShootEntrance = "";

    static {
        Covode.recordClassIndex(84536);
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftId() {
        return this.draftId;
    }

    public final String getNewDraftId() {
        return this.newDraftId;
    }

    public final int getOriginal() {
        return this.original;
    }

    public final int getShootMode() {
        return this.shootMode;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStorySceneId() {
        return this.storySceneId;
    }

    public final String getStoryShootEntrance() {
        return this.storyShootEntrance;
    }

    public final void setDraftId(int i) {
        this.draftId = i;
    }

    public final void setOriginal(int i) {
        this.original = i;
    }

    public final void setShootMode(int i) {
        this.shootMode = i;
    }

    public final void setContentSource(String str) {
        C89219l.m154721d(str, "");
        this.contentSource = str;
    }

    public final void setContentType(String str) {
        C89219l.m154721d(str, "");
        this.contentType = str;
    }

    public final void setCreationId(String str) {
        C89219l.m154721d(str, "");
        this.creationId = str;
    }

    public final void setNewDraftId(String str) {
        C89219l.m154721d(str, "");
        this.newDraftId = str;
    }

    public final void setShootWay(String str) {
        C89219l.m154721d(str, "");
        this.shootWay = str;
    }

    public final void setStorySceneId(String str) {
        C89219l.m154721d(str, "");
        this.storySceneId = str;
    }

    public final void setStoryShootEntrance(String str) {
        C89219l.m154721d(str, "");
        this.storyShootEntrance = str;
    }
}
