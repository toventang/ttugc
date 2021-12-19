package com.p2082ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.setting.C68040by;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.tools.draft.p4100a.AbstractC78124a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.i */
public final class C78386i extends AbstractC78124a<C43223c> {

    /* renamed from: a */
    TextView f176125a;

    /* renamed from: b */
    TextView f176126b;

    /* renamed from: c */
    boolean f176127c;

    /* renamed from: d */
    public boolean f176128d;

    /* renamed from: e */
    Context f176129e;

    static {
        Covode.recordClassIndex(91512);
    }

    C78386i(boolean z, View view) {
        super(view);
        this.f176127c = z;
        this.f176129e = view.getContext();
        this.f176125a = (TextView) C0792v.m2762c(view, (int) R.id.ezt);
        this.f176126b = (TextView) C0792v.m2762c(view, (int) R.id.es1);
    }

    /* renamed from: a */
    static /* synthetic */ C89391z m136897a(ActivityC0945e eVar, C43223c cVar, Boolean bool, String str) {
        String musicId;
        if (!bool.booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                new C79459a(eVar).mo123050a(R.string.dau).mo123053a();
            } else {
                new C79459a(eVar).mo123052a(str).mo123053a();
            }
            return null;
        } else if (C40964c.C40968c.f95804a.mo70144a()) {
            C84911q.m145928d("app is running background");
            return null;
        } else {
            C69905c clone = cVar.f100906f.clone();
            C84425b a = new C84425b().mo129406a("shoot_way", "draft_again").mo129406a("shoot_entrance", "draft_again").mo129406a("enter_method", "draft_again");
            if (clone == null) {
                musicId = "";
            } else {
                musicId = clone.getMusicId();
            }
            C80322d.m139251a("shoot", a.mo129406a("music_id", musicId).mo129407a("is_ui_shoot", true).f188764a);
            if (clone != null) {
                clone.setMusicPriority(99);
                C70005cr.m123611a().mo70083a(clone);
                String str2 = cVar.f100908h;
                int i = cVar.f100914n;
                C40970e.m82485a("toVideoRecord() called with: path = [" + str2 + "], context = [], musicModel = [" + clone + "], start = [" + i + "]");
                try {
                    new JSONObject().put("route", "1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C59213ah.f134852a = "draft_page";
                if (C68040by.m120336a()) {
                    String musicId2 = clone.getMusicId();
                    String str3 = cVar.f100892O;
                    if (C63253l.f143623a.mo73309e().mo93761c()) {
                        C63244g.m114602a().mo73255A().mo93901a();
                    }
                    m136898a(eVar, musicId2, str2, i, str3);
                } else {
                    m136898a(eVar, clone.getMusicId(), str2, i, "");
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    private static void m136898a(Context context, String str, String str2, int i, String str3) {
        String uuid = UUID.randomUUID().toString();
        ArrayList<String> a = C75466g.m132343a(str3);
        C84425b a2 = new C84425b().mo129406a("creation_id", uuid).mo129406a("shoot_way", "draft_again").mo129406a("shoot_entrance", "draft_again").mo129406a("enter_method", "draft_again").mo129406a("music_id", str).mo129407a("is_ui_shoot", false).mo129406a("group_id", C70747dv.m124972a());
        if (!C84904k.m145909a(a) && !TextUtils.isEmpty(a.get(0))) {
            a2.mo129406a("prop_id", a.get(0));
        }
        C80322d.m139251a("shoot", a2.f188764a);
        C40970e.m82485a("toVideoActivity() called with: context = [ ], path = [" + str2 + "], musicStart = [" + i + "]");
        Intent intent = new Intent();
        intent.putExtra("path", str2);
        intent.putExtra("music_start", i);
        intent.putExtra("record_from", 1);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", "draft_again");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("extra_sticker_from", "draft");
        intent.putStringArrayListExtra("reuse_sticker_ids", C75466g.m132343a(str3));
        C70005cr.m123611a().mo110456f();
        intent.setClass(context, VideoRecordPermissionActivity.class);
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }
}
