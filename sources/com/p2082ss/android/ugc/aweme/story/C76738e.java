package com.p2082ss.android.ugc.aweme.story;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2432c.AbstractC35338e;
import com.p2082ss.android.ugc.aweme.p2432c.C35334a;
import com.p2082ss.android.ugc.aweme.p2432c.C35335b;
import com.p2082ss.android.ugc.aweme.p2432c.C35336c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.e */
public final class C76738e {
    static {
        Covode.recordClassIndex(89734);
    }

    /* renamed from: a */
    public static final String m134317a(int i, EditPreviewInfo editPreviewInfo, ShortVideoContext shortVideoContext) {
        AbstractC35338e eVar;
        long j;
        long j2;
        C89219l.m154721d(editPreviewInfo, "");
        C89219l.m154721d(shortVideoContext, "");
        if (i == 2) {
            List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) videoList, 10));
            Iterator<T> it = videoList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getVideoPath());
            }
            eVar = new C35336c(arrayList);
        } else {
            EditVideoSegment editVideoSegment = (EditVideoSegment) C89070n.m154579f((List) editPreviewInfo.getVideoList());
            String videoPath = editVideoSegment.getVideoPath();
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                j = videoCutInfo.getStart();
            } else {
                j = 0;
            }
            VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo2 != null) {
                j2 = videoCutInfo2.getEnd();
            } else {
                j2 = -1;
            }
            eVar = new C35335b(videoPath, j, j2);
        }
        AbstractC63154aa.AbstractC63157c k = C63253l.f143623a.mo73306b().mo101552k();
        String str = shortVideoContext.f155830o;
        C89219l.m154716b(str, "");
        return k.mo101558a(new C35334a(eVar, 0, str, null, false, false, 122));
    }
}
