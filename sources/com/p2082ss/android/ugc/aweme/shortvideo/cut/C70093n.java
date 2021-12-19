package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71416e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71419h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import dmt.p4542av.video.C88151a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.n */
public final class C70093n {

    /* renamed from: a */
    public static final C70093n f156763a = new C70093n();

    private C70093n() {
    }

    static {
        Covode.recordClassIndex(82516);
    }

    /* renamed from: a */
    private static void m123773a(List<? extends VideoSegment> list) {
        T next;
        int i;
        T next2;
        int i2;
        Iterator<T> it = list.iterator();
        T t = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int i3 = next.f156715g;
                do {
                    T next3 = it.next();
                    int i4 = next3.f156715g;
                    if (i3 < i4) {
                        next = next3;
                        i3 = i4;
                    }
                } while (it.hasNext());
            }
        }
        T t2 = next;
        int i5 = 0;
        if (t2 != null) {
            i = t2.f156715g;
        } else {
            i = 0;
        }
        C88151a.m153230a("video_height", Integer.valueOf(i));
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            next2 = null;
        } else {
            next2 = it2.next();
            if (it2.hasNext()) {
                int i6 = next2.f156714f;
                do {
                    T next4 = it2.next();
                    int i7 = next4.f156714f;
                    if (i6 < i7) {
                        next2 = next4;
                        i6 = i7;
                    }
                } while (it2.hasNext());
            }
        }
        T t3 = next2;
        if (t3 != null) {
            i2 = t3.f156714f;
        } else {
            i2 = 0;
        }
        C88151a.m153230a("video_width", Integer.valueOf(i2));
        Iterator<T> it3 = list.iterator();
        if (it3.hasNext()) {
            t = it3.next();
            if (it3.hasNext()) {
                int a = t.mo110570a();
                do {
                    T next5 = it3.next();
                    int a2 = next5.mo110570a();
                    if (a < a2) {
                        t = next5;
                        a = a2;
                    }
                } while (it3.hasNext());
            }
        }
        T t4 = t;
        if (t4 != null) {
            i5 = t4.mo110570a();
        }
        C88151a.m153230a("video_fps", Integer.valueOf(i5));
    }

    /* renamed from: a */
    public static EditPreviewInfo m123772a(boolean z, Workspace workspace, List<? extends VideoSegment> list, long[] jArr) {
        VideoCutInfo videoCutInfo;
        VideoCutInfo videoCutInfo2;
        C89219l.m154721d(workspace, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(jArr, "");
        if (z) {
            ArrayList arrayList = new ArrayList();
            m123773a(list);
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(C71413b.m126116a((VideoSegment) it.next()));
            }
            ArrayList arrayList3 = arrayList2;
            if ((!arrayList3.isEmpty()) && arrayList3 != null) {
                arrayList.addAll(arrayList3);
            }
            long[] jArr2 = {jArr[0], jArr[1]};
            long j = jArr2[0];
            long j2 = jArr2[1];
            if (j >= 0 && (videoCutInfo2 = ((EditVideoSegment) arrayList.get(0)).getVideoCutInfo()) != null) {
                arrayList.set(0, EditVideoSegment.copy$default((EditVideoSegment) arrayList.get(0), null, null, null, new VideoCutInfo(j + videoCutInfo2.getStart(), videoCutInfo2.getEnd(), videoCutInfo2.getSpeed(), videoCutInfo2.getRotate()), 7, null));
            }
            if (j2 >= 0 && (videoCutInfo = ((EditVideoSegment) arrayList.get(arrayList.size() - 1)).getVideoCutInfo()) != null) {
                arrayList.set(arrayList.size() - 1, EditVideoSegment.copy$default((EditVideoSegment) arrayList.get(arrayList.size() - 1), null, null, null, new VideoCutInfo(videoCutInfo.getStart(), videoCutInfo.getEnd() - j2, videoCutInfo.getSpeed(), videoCutInfo.getRotate()), 7, null));
            }
            return new C71416e(C63244g.m114602a().mo73281i().getVideoWidth(), C63244g.m114602a().mo73281i().getVideoHeight(), 28).mo113021a(arrayList);
        }
        C71419h hVar = new C71419h(0, 0, null, 31);
        File a = workspace.mo110089a();
        C89219l.m154716b(a, "");
        String path = a.getPath();
        C89219l.m154716b(path, "");
        File b = workspace.mo110091b();
        C89219l.m154716b(b, "");
        String path2 = b.getPath();
        File a2 = workspace.mo110089a();
        C89219l.m154716b(a2, "");
        return hVar.mo113031a(new EditVideoSegment(path, path2, C71413b.m126117a(a2.getPath())));
    }
}
