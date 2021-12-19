package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.content.Context;
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

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel */
public final class MusicRecyclerViewPoolViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public static final C36027a f85101a = new C36027a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f85102b = C89250i.m154773a((AbstractC89171a) C36028b.f85103a);

    static {
        Covode.recordClassIndex(43273);
    }

    /* renamed from: a */
    public final RecyclerView.RecycledViewPool mo63190a() {
        return (RecyclerView.RecycledViewPool) this.f85102b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel$a */
    public static final class C36027a {
        static {
            Covode.recordClassIndex(43274);
        }

        private C36027a() {
        }

        public /* synthetic */ C36027a(byte b) {
            this();
        }

        /* renamed from: a */
        public static RecyclerView.RecycledViewPool m73455a(Context context) {
            if (context instanceof ActivityC0945e) {
                return ((MusicRecyclerViewPoolViewModel) C1181ae.m3881a((ActivityC0945e) context, (C1175ad.AbstractC1177b) null).mo3983a(MusicRecyclerViewPoolViewModel.class)).mo63190a();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel$b */
    static final class C36028b extends AbstractC89220m implements AbstractC89171a<RecyclerView.RecycledViewPool> {

        /* renamed from: a */
        public static final C36028b f85103a = new C36028b();

        static {
            Covode.recordClassIndex(43275);
        }

        C36028b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView.RecycledViewPool invoke() {
            RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
            recycledViewPool.setMaxRecycledViews(0, 18);
            return recycledViewPool;
        }
    }
}
