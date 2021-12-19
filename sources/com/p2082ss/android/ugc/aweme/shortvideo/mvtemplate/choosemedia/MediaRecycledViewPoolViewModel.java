package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRecycledViewPoolViewModel */
public final class MediaRecycledViewPoolViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public static final C72033a f161404a = new C72033a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f161405b = C89250i.m154773a((AbstractC89171a) C72034b.f161406a);

    static {
        Covode.recordClassIndex(84684);
    }

    /* renamed from: a */
    public final RecyclerView.RecycledViewPool mo114245a() {
        return (RecyclerView.RecycledViewPool) this.f161405b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRecycledViewPoolViewModel$a */
    public static final class C72033a {
        static {
            Covode.recordClassIndex(84685);
        }

        private C72033a() {
        }

        public /* synthetic */ C72033a(byte b) {
            this();
        }

        /* renamed from: a */
        public static RecyclerView.RecycledViewPool m127120a(ActivityC0945e eVar) {
            if (eVar != null) {
                return ((MediaRecycledViewPoolViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(MediaRecycledViewPoolViewModel.class)).mo114245a();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRecycledViewPoolViewModel$b */
    static final class C72034b extends AbstractC89220m implements AbstractC89171a<RecyclerView.RecycledViewPool> {

        /* renamed from: a */
        public static final C72034b f161406a = new C72034b();

        static {
            Covode.recordClassIndex(84686);
        }

        C72034b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView.RecycledViewPool invoke() {
            RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
            recycledViewPool.setMaxRecycledViews(0, 30);
            return recycledViewPool;
        }
    }
}
