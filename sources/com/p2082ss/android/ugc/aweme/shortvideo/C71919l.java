package com.p2082ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l */
public final class C71919l {

    /* renamed from: c */
    public static final C71920a f161157c = new C71920a((byte) 0);

    /* renamed from: a */
    public final Fragment f161158a;

    /* renamed from: b */
    public final int f161159b = 0;

    /* renamed from: d */
    private C71804ej f161160d;

    /* renamed from: e */
    private ViewGroup f161161e;

    /* renamed from: f */
    private ViewGroup f161162f;

    /* renamed from: g */
    private ViewGroup f161163g;

    static {
        Covode.recordClassIndex(84468);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l$a */
    public static final class C71920a {
        static {
            Covode.recordClassIndex(84469);
        }

        private C71920a() {
        }

        public /* synthetic */ C71920a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l$b */
    static final class C71921b implements MentionEditText.AbstractC74129c {

        /* renamed from: a */
        final /* synthetic */ C71919l f161164a;

        static {
            Covode.recordClassIndex(84470);
        }

        C71921b(C71919l lVar) {
            this.f161164a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText.AbstractC74129c
        /* renamed from: a */
        public final void mo113564a() {
            if (!C63238c.f143594u.mo93901a()) {
                C63238c.f143578e.mo93878a(this.f161164a.f161158a, "", this.f161164a.f161159b);
            }
        }
    }

    public C71919l(Fragment fragment, C71804ej ejVar, View view) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(ejVar, "");
        C89219l.m154721d(view, "");
        this.f161158a = fragment;
        this.f161160d = ejVar;
        this.f161161e = (ViewGroup) view.findViewById(R.id.gp);
        this.f161162f = (ViewGroup) view.findViewById(R.id.bdj);
        this.f161163g = (ViewGroup) view.findViewById(R.id.uk);
        C71804ej ejVar2 = this.f161160d;
        if (ejVar2 == null) {
            C89219l.m154715b();
        }
        HashTagMentionEditText hashTagMentionEditText = ejVar2.f160912c;
        C89219l.m154716b(hashTagMentionEditText, "");
        hashTagMentionEditText.setOnMentionInputListener(new C71921b(this));
    }
}
