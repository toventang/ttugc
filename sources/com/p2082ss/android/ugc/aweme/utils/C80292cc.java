package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.cc */
public final class C80292cc {
    static {
        Covode.recordClassIndex(93560);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.cc$a */
    public static final class C80293a extends AbstractC89220m implements AbstractC89172b<EditVideoSegment, CharSequence> {

        /* renamed from: a */
        public static final C80293a f179814a = new C80293a();

        static {
            Covode.recordClassIndex(93561);
        }

        C80293a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(EditVideoSegment editVideoSegment) {
            EditVideoSegment editVideoSegment2 = editVideoSegment;
            C89219l.m154721d(editVideoSegment2, "");
            return editVideoSegment2.getVideoFileInfo().toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.cc$b */
    public static final class C80294b extends AbstractC89220m implements AbstractC89172b<EditVideoSegment, CharSequence> {

        /* renamed from: a */
        public static final C80294b f179815a = new C80294b();

        static {
            Covode.recordClassIndex(93562);
        }

        C80294b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(EditVideoSegment editVideoSegment) {
            EditVideoSegment editVideoSegment2 = editVideoSegment;
            C89219l.m154721d(editVideoSegment2, "");
            return String.valueOf(editVideoSegment2.getVideoCutInfo());
        }
    }
}
