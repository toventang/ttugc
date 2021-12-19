package com.p2082ss.android.ugc.aweme.xsearch.live;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.p2054c.C28725c;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.live.LynxSearchLive */
public final class LynxSearchLive extends LynxUI<C81741b> {

    /* renamed from: a */
    public static final C81738a f182780a = new C81738a((byte) 0);

    static {
        Covode.recordClassIndex(95143);
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.live.LynxSearchLive$a */
    public static final class C81738a {
        static {
            Covode.recordClassIndex(95144);
        }

        private C81738a() {
        }

        public /* synthetic */ C81738a(byte b) {
            this();
        }
    }

    @AbstractC28528p
    public final void play() {
        AbstractC34186b.AbstractC34189c cVar = ((C81741b) this.mView).getDataProvider().f80896e;
        if (cVar != null) {
            cVar.mo60340a(150);
        }
    }

    @AbstractC28528p
    public final void stop() {
        AbstractC34186b.AbstractC34189c cVar = ((C81741b) this.mView).getDataProvider().f80896e;
        if (cVar != null) {
            cVar.bi_();
        }
    }

    @AbstractC28525m(mo49059a = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((C81741b) this.mView).setAutoPlay(z);
    }

    @AbstractC28525m(mo49059a = "muted")
    public final void setMuted(boolean z) {
        ((C81741b) this.mView).setMuted(z);
    }

    @AbstractC28525m(mo49059a = "sessionid")
    public final void setSessionId(int i) {
        ((C81741b) this.mView).setSessionId(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxSearchLive(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154721d(jVar, "");
    }

    @AbstractC28525m(mo49059a = "objectfit")
    public final void setObjectFit(String str) {
        C89219l.m154721d(str, "");
        ((C81741b) this.mView).setObjectFit(str);
    }

    @AbstractC28525m(mo49059a = "awemeindex")
    public final void setAwemeIndex(ReadableMap readableMap) {
        if (readableMap != null) {
            ((C81741b) this.mView).setAwemeIndex(new C81740a(readableMap.getInt("card_rank", -1), readableMap.getInt("aweme_index")));
        }
    }

    @AbstractC28525m(mo49059a = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (!(readableMap == null || (hashMap = readableMap.toHashMap()) == null)) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                C89219l.m154716b(key, "");
                hashMap2.put(key, entry.getValue());
            }
            ((C81741b) this.mView).setLogExtra(hashMap2);
        }
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ C81741b createView(Context context, Object obj) {
        C89219l.m154721d(context, "");
        C81741b bVar = new C81741b(context, (byte) 0);
        bVar.setEventChangeListener(new C81739b(this));
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.live.LynxSearchLive$b */
    static final class C81739b extends AbstractC89220m implements AbstractC89183m<String, Map<String, ? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxSearchLive f182781a;

        static {
            Covode.recordClassIndex(95145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81739b(LynxSearchLive lynxSearchLive) {
            super(2);
            this.f182781a = lynxSearchLive;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, ? extends Object> map) {
            String str2 = str;
            Map<String, ? extends Object> map2 = map;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(map2, "");
            C89219l.m154721d(str2, "");
            if (C89047am.m154438a((Object[]) new String[]{"play", "ended", "error", "loading"}).contains(str2)) {
                AbstractC28520j jVar = this.f182781a.mContext;
                C89219l.m154716b(jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f182781a.getSign(), str2);
                for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                    cVar2.mo49838a(entry.getKey(), entry.getValue());
                }
                cVar.mo49834a(cVar2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
