package com.p2082ss.android.ugc.aweme.choosemusic.bullet.jsb;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.C28027t;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.search.p3690f.C67433b;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.bullet.jsb.ShootMusicMethod */
public final class ShootMusicMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35759a f84368b = new C35759a((byte) 0);

    /* renamed from: c */
    private final String f84369c = "shootMusic";

    static {
        Covode.recordClassIndex(42997);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.bullet.jsb.ShootMusicMethod$a */
    public static final class C35759a {
        static {
            Covode.recordClassIndex(42998);
        }

        private C35759a() {
        }

        public /* synthetic */ C35759a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.bullet.jsb.ShootMusicMethod$b */
    public static final class C35760b extends C27895a<Music> {
        static {
            Covode.recordClassIndex(42999);
        }

        C35760b() {
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f84369c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShootMusicMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: b */
    private static Music m72942b(String str) {
        try {
            Type type = new C35760b().type;
            GsonProvider c = GsonHolder.m138943c();
            C89219l.m154716b(c, "");
            return (Music) c.mo123620b().mo46671a(str, type);
        } catch (C28027t e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            String optString = jSONObject.optString("music", "");
            if (!TextUtils.isEmpty(optString)) {
                C89219l.m154716b(optString, "");
                Music b = m72942b(optString);
                if (b != null) {
                    AbstractC81915c.m141874a(new C67433b(b));
                }
            }
            aVar.mo61872a(new JSONArray());
        } catch (Exception e) {
            aVar.mo61871a(0, e.getMessage());
            e.printStackTrace();
        }
    }
}
