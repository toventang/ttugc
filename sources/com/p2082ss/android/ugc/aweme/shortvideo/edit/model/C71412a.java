package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.a */
public final class C71412a {
    static {
        Covode.recordClassIndex(83946);
    }

    /* renamed from: b */
    public static final long m126107b(EditPreviewInfo editPreviewInfo) {
        long j = 0;
        if (editPreviewInfo == null) {
            return 0;
        }
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            j += editVideoSegment.getVideoFileInfo().getDuration();
        }
        return j;
    }

    /* renamed from: c */
    public static final long m126108c(EditPreviewInfo editPreviewInfo) {
        long j = 0;
        if (editPreviewInfo == null) {
            return 0;
        }
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            j += new File(editVideoSegment.getVideoPath()).length();
        }
        return j;
    }

    /* renamed from: d */
    public static final long m126109d(EditPreviewInfo editPreviewInfo) {
        long j = 0;
        if (editPreviewInfo == null) {
            return 0;
        }
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            j += new File(editVideoSegment.getAudioPath()).length();
        }
        return j;
    }

    /* renamed from: a */
    public static final String m126106a(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        int i = 0;
        for (T t : videoList) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            sb.append("the " + i + " video path =>{" + t.getVideoPath() + "} \n");
            i = i2;
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: e */
    public static final String m126110e(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        int i = 0;
        for (T t : videoList) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            sb.append("the " + i + " audio path => {" + t.getAudioPath() + "} \n");
            i = i2;
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
