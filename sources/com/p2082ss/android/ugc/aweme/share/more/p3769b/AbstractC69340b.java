package com.p2082ss.android.ugc.aweme.share.more.p3769b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.more.b.b */
public interface AbstractC69340b {
    static {
        Covode.recordClassIndex(81671);
    }

    /* renamed from: a */
    List<AbstractC69693h> mo109617a(List<? extends AbstractC69693h> list);

    /* renamed from: b */
    List<AbstractC69693h> mo109618b(List<? extends AbstractC69693h> list);

    /* renamed from: com.ss.android.ugc.aweme.share.more.b.b$a */
    public static final class C69341a implements AbstractC69340b {

        /* renamed from: a */
        public static final C69341a f154912a = new C69341a();

        /* renamed from: b */
        private static final List<String> f154913b = C89070n.m154522b("video_tag_remove", "report", "dislike", "save", "promote", "favorite", "video_tag_edit", "live_photo");

        private C69341a() {
        }

        static {
            Covode.recordClassIndex(81672);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.more.p3769b.AbstractC69340b
        /* renamed from: a */
        public final List<AbstractC69693h> mo109617a(List<? extends AbstractC69693h> list) {
            C89219l.m154721d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (f154913b.contains(t.mo61919c())) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }

        @Override // com.p2082ss.android.ugc.aweme.share.more.p3769b.AbstractC69340b
        /* renamed from: b */
        public final List<AbstractC69693h> mo109618b(List<? extends AbstractC69693h> list) {
            C89219l.m154721d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!f154913b.contains(t.mo61919c())) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.b.b$b */
    public static final class C69342b implements AbstractC69340b {

        /* renamed from: a */
        public static final C69342b f154914a = new C69342b();

        /* renamed from: b */
        private static final List<String> f154915b = C89070n.m154522b("video_tag_remove", "save", "promote", "play_list", "favorite", "video_tag_edit");

        /* renamed from: c */
        private static final List<String> f154916c = C89070n.m154522b("report", "dislike", "privacy", "delete");

        private C69342b() {
        }

        static {
            Covode.recordClassIndex(81673);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.more.p3769b.AbstractC69340b
        /* renamed from: a */
        public final List<AbstractC69693h> mo109617a(List<? extends AbstractC69693h> list) {
            C89219l.m154721d(list, "");
            return C89086z.INSTANCE;
        }

        @Override // com.p2082ss.android.ugc.aweme.share.more.p3769b.AbstractC69340b
        /* renamed from: b */
        public final List<AbstractC69693h> mo109618b(List<? extends AbstractC69693h> list) {
            C89219l.m154721d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (f154915b.contains(t.mo61919c())) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : list) {
                if (f154916c.contains(t2.mo61919c())) {
                    arrayList3.add(t2);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            for (T t3 : list) {
                T t4 = t3;
                if (!f154915b.contains(t4.mo61919c()) && !f154916c.contains(t4.mo61919c())) {
                    arrayList5.add(t3);
                }
            }
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = new ArrayList();
            if (!arrayList2.isEmpty()) {
                arrayList7.addAll(arrayList2);
                arrayList7.add(new C69339a());
            }
            if (!arrayList4.isEmpty()) {
                arrayList7.addAll(arrayList4);
                arrayList7.add(new C69339a());
            }
            if (!arrayList6.isEmpty()) {
                arrayList7.addAll(arrayList6);
                arrayList7.add(new C69339a());
            }
            arrayList7.remove(arrayList7.size() - 1);
            return arrayList7;
        }
    }
}
