package com.p2082ss.android.ugc.aweme.xsearch.video;

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
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.aweme.xsearch.video.C81772d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.xsearch.video.LynxSearchVideo */
public final class LynxSearchVideo extends LynxUI<C81753b> {

    /* renamed from: a */
    public static final AbstractC89244h f182803a = C89250i.m154773a((AbstractC89171a) C81750b.f182805a);

    /* renamed from: b */
    public static final C81749a f182804b = new C81749a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.LynxSearchVideo$a */
    public static final class C81749a {
        static {
            Covode.recordClassIndex(95156);
        }

        private C81749a() {
        }

        public /* synthetic */ C81749a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
    }

    @AbstractC28528p
    public final void pause() {
        ((C81753b) this.mView).mo125463j();
    }

    @AbstractC28528p
    public final void play() {
        ((C81753b) this.mView).mo125462i();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void measure() {
        C89219l.m154721d("XSearchVideo measure", "");
        super.measure();
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.LynxSearchVideo$b */
    static final class C81750b extends AbstractC89220m implements AbstractC89171a<Set<? extends String>> {

        /* renamed from: a */
        public static final C81750b f182805a = new C81750b();

        static {
            Covode.recordClassIndex(95157);
        }

        C81750b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<? extends String> invoke() {
            return C89047am.m154438a((Object[]) new String[]{"play", "pause", "stop", "ended", "error", "loading", "timeupdate"});
        }
    }

    static {
        Covode.recordClassIndex(95155);
    }

    @AbstractC28528p
    public final void stop() {
        C81753b bVar = (C81753b) this.mView;
        Aweme mAweme = bVar.getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        bVar.mo125461h();
        C81772d.C81774b.f182846a.mo125489a(null, null, null, bVar.f182811b);
    }

    public LynxSearchVideo(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((C81753b) this.mView).setAutoPlay(z);
    }

    @AbstractC28525m(mo49059a = "muted")
    public final void setMuted(boolean z) {
        ((C81753b) this.mView).setMuted(z);
    }

    @AbstractC28525m(mo49059a = "repeat")
    public final void setRepeat(boolean z) {
        ((C81753b) this.mView).setRepeat(z);
    }

    @AbstractC28525m(mo49059a = "sessionid")
    public final void setSessionId(int i) {
        ((C81753b) this.mView).setSessionId(i);
    }

    @AbstractC28525m(mo49059a = "objectfit")
    public final void setObjectFit(String str) {
        C89219l.m154721d(str, "");
        ((C81753b) this.mView).setObjectFit(str);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ C81753b createView(Context context) {
        if (context == null) {
            C89219l.m154715b();
        }
        C81753b bVar = new C81753b(context, (byte) 0);
        bVar.setEventChangeListener(new C81751c(this));
        return bVar;
    }

    @AbstractC28525m(mo49059a = "awemeindex")
    public final void setAwemeIndex(ReadableMap readableMap) {
        if (readableMap != null) {
            ((C81753b) this.mView).setAwemeIndex(new C81752a((int) readableMap.getDouble("card_rank"), (int) readableMap.getDouble("aweme_index")));
        }
    }

    @AbstractC28525m(mo49059a = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        if (readableMap != null) {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            C89219l.m154716b(hashMap, "");
            ((C81753b) this.mView).setLogExtra(hashMap);
        }
    }

    @AbstractC28525m(mo49059a = "rate")
    public final void setRate(int i) {
        System.out.println((Object) "XSearchVideo- rate -> ".concat(String.valueOf(i)));
        ((C81753b) this.mView).setRate(i);
    }

    @AbstractC28525m(mo49059a = "aweme")
    public final void setAweme(ReadableMap readableMap) {
        if (readableMap != null) {
            readableMap.getString("aid");
            GsonProvider c = GsonHolder.m138943c();
            C89219l.m154716b(c, "");
            String b = c.mo123620b().mo46674b(readableMap);
            C89219l.m154716b(b, "");
            ((C81753b) this.mView).setAweme(b);
        }
    }

    @AbstractC28525m(mo49059a = "__control")
    public final void setControl(String str) {
        boolean z;
        List<String> b;
        C81753b bVar;
        JSONObject jSONObject;
        C81753b bVar2;
        if (str != null) {
            boolean z2 = false;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (b = C89361p.m154915b(str, new String[]{"_*_"})) != null && b.size() == 3) {
                List<String> b2 = C89361p.m154915b(str, new String[]{"_*_"});
                String str2 = b2.get(0);
                int hashCode = str2.hashCode();
                if (hashCode != 3443508) {
                    if (hashCode != 3526264) {
                        if (hashCode == 106440182 && str2.equals("pause") && (bVar2 = (C81753b) this.mView) != null) {
                            bVar2.mo125463j();
                        }
                    } else if (str2.equals("seek")) {
                        try {
                            jSONObject = new JSONObject(b2.get(1));
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                        C81753b bVar3 = (C81753b) this.mView;
                        if (bVar3 != null) {
                            int optInt = jSONObject.optInt("position", 0);
                            if (jSONObject.optInt("play") == 1) {
                                z2 = true;
                            }
                            bVar3.mo125450a(optInt, z2);
                        }
                    }
                } else if (str2.equals("play") && (bVar = (C81753b) this.mView) != null) {
                    bVar.mo125462i();
                }
            }
        }
    }

    @AbstractC28528p
    public final void seek(int i, boolean z) {
        ((C81753b) this.mView).mo125450a(i, z);
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.LynxSearchVideo$c */
    static final class C81751c extends AbstractC89220m implements AbstractC89183m<String, Map<String, ? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxSearchVideo f182806a;

        static {
            Covode.recordClassIndex(95158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81751c(LynxSearchVideo lynxSearchVideo) {
            super(2);
            this.f182806a = lynxSearchVideo;
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
            if (((Set) LynxSearchVideo.f182803a.getValue()).contains(str2)) {
                AbstractC28520j jVar = this.f182806a.mContext;
                C89219l.m154716b(jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f182806a.getSign(), str2);
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
        C89219l.m154721d("XSearchVideo updateLayout", "");
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        C89219l.m154721d("XSearchVideo updateLayoutInfo", "");
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
