package com.p2082ss.android.ugc.aweme.servicimpl;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69843au;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.AbstractC73587b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73586a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.tools.C78596f;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.math.BigDecimal;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.m */
final /* synthetic */ class C67928m implements AbstractC88433f {

    /* renamed from: a */
    private final C67925j f152171a;

    /* renamed from: b */
    private final C78596f f152172b;

    static {
        Covode.recordClassIndex(80097);
    }

    C67928m(C67925j jVar, C78596f fVar) {
        this.f152171a = jVar;
        this.f152172b = fVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str;
        String str2;
        C67925j jVar = this.f152171a;
        C78596f fVar = this.f152172b;
        C69843au auVar = (C69843au) obj;
        C73975b.C73976a.f166071a.step("av_video_edit", "fetchMusicBeanEnd");
        C70625d a = auVar.mo110193a();
        MultiEditVideoStatusRecordData b = auVar.mo110194b();
        int i = fVar.f176642d;
        if (b == null) {
            if (!jVar.f152161i.mo110022c()) {
                jVar.f152160h.mo22879a(new C14207x("go edit activity"));
                jVar.f152160h.mo116656U();
                jVar.f152154b.mo110050b(false);
                jVar.f152160h.mo22890b(true);
                C17197a.C17200a a2 = new C17197a.C17200a(jVar.f152158f).mo27189a(R.string.h7d);
                a2.f41059E = true;
                a2.mo27194b(R.string.h7b).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.h7c, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC67933r(jVar), false).mo27193a().mo27185c();
                C40971f.m82489a("recordData is null");
                return;
            }
            str = fVar.f176639a;
            str2 = fVar.f176640b;
            C43213k.m86181a("goEditActivity ev.getVideoPath = ".concat(String.valueOf(str)));
        } else {
            if (!jVar.f152161i.mo110022c()) {
                str = b.curMultiEditVideoRecordData.segmentDataList.get(0).videoPath;
                str2 = b.curMultiEditVideoRecordData.segmentDataList.get(0).audioPath;
                C43213k.m86181a("goEditActivity segmentDataList.get(0) video path = ".concat(String.valueOf(str)));
            }
            str = fVar.f176639a;
            str2 = fVar.f176640b;
            C43213k.m86181a("goEditActivity ev.getVideoPath = ".concat(String.valueOf(str)));
        }
        C40970e.m82485a("onConcatFinished:".concat(String.valueOf(i)));
        if (i >= 0) {
            C40982q.m82520a("aweme_concat_success_rate", 0, (JSONObject) null);
            jVar.f152161i.mo110007a(jVar.f152159g.mo22751E().mo122474e());
            jVar.f152161i.f155779aM = new BigDecimal((double) jVar.f152161i.f155817b.f155636A).setScale(1, 4).floatValue();
            C67925j.m120205a(jVar.f152158f, jVar.f152161i);
            jVar.f152160h.mo116651P();
            C73586a aVar = new C73586a(jVar.f152158f, jVar.f152160h.f166637k, jVar.f152155c, jVar.f152161i, jVar.f152159g.mo22757K(), a, b, str, str2);
            C70005cr.m123611a().f156493m = RecordScene.containBusiSticker(jVar.f152161i.f155817b.f155650f);
            jVar.f152162j.mo116185a(new AbstractC73587b.C73588a(aVar));
            jVar.f152154b.mo110050b(false);
            jVar.f152159g.mo22753G();
            return;
        }
        boolean a3 = str != null ? C84902i.m145892a(str) : false;
        boolean exists = str2 != null ? new File(str2).exists() : false;
        File file = new File(jVar.f152161i.f155817b.f155652h.mo110096e() + "1_frag_v");
        C40982q.m82520a("aweme_concat_success_rate", 1, new C69840ar().mo110187a("errorCode", Integer.valueOf(i)).mo110189a("videoPath", str.toString()).mo110189a("audioPath", str2).mo110189a("videoFileExists", String.valueOf(a3)).mo110189a("audioFileExists", String.valueOf(exists)).mo110189a("firstSegmentPath", String.valueOf(file.exists())).mo110189a("firstSegmentLength", String.valueOf(file.length())).mo110189a("hardEncode", String.valueOf(jVar.f152161i.f155817b.f155649e)).mo110185a("abParam", (Boolean) true).mo110191a());
        String string = jVar.f152158f.getString(R.string.ary, new Object[]{Integer.valueOf(i)});
        if ((i == -10021 || i == -2000) && jVar.f152158f != null) {
            string = jVar.f152158f.getString(R.string.b8k);
        }
        new C79459a(jVar.f152158f).mo123052a(string).mo123053a();
        jVar.f152154b.mo110050b(false);
        C80510gr.m139533a("record_error", "2", "concat failed , ve result = " + fVar.f176642d);
    }
}
