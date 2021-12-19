package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.AbstractC73587b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73586a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.tools.C78596f;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.math.BigDecimal;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ay */
final /* synthetic */ class C69847ay implements AbstractC88433f {

    /* renamed from: a */
    private final C69844av f156088a;

    /* renamed from: b */
    private final C78596f f156089b;

    static {
        Covode.recordClassIndex(82255);
    }

    C69847ay(C69844av avVar, C78596f fVar) {
        this.f156088a = avVar;
        this.f156089b = fVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str;
        String str2;
        C69844av avVar = this.f156088a;
        C78596f fVar = this.f156089b;
        C69843au auVar = (C69843au) obj;
        C73975b.C73976a.f166071a.step("av_video_edit", "fetchMusicBeanEnd");
        C70625d a = auVar.mo110193a();
        MultiEditVideoStatusRecordData b = auVar.mo110194b();
        int i = fVar.f176642d;
        if (b == null) {
            if (!avVar.f156083i.mo110022c()) {
                avVar.f156082h.mo22879a(new C14207x("go edit activity"));
                avVar.f156082h.mo116656U();
                avVar.f156076b.mo110050b(false);
                avVar.f156082h.mo22890b(true);
                C17197a.C17200a a2 = new C17197a.C17200a(avVar.f156080f).mo27189a(R.string.h7d);
                a2.f41059E = true;
                a2.mo27194b(R.string.h7b).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.h7c, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC69854bd(avVar), false).mo27193a().mo27185c();
                C40971f.m82489a("recordData is null");
                return;
            }
            str = fVar.f176639a;
            str2 = fVar.f176640b;
            C43213k.m86181a("goEditActivity ev.getVideoPath = ".concat(String.valueOf(str)));
        } else {
            if (!avVar.f156083i.mo110022c()) {
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
            avVar.f156083i.mo110007a(avVar.f156081g.mo22751E().mo122474e());
            avVar.f156083i.f155779aM = new BigDecimal((double) avVar.f156083i.f155817b.f155636A).setScale(1, 4).floatValue();
            C69844av.m123417a(avVar.f156080f, avVar.f156083i);
            avVar.f156082h.mo116651P();
            C73586a aVar = new C73586a(avVar.f156080f, avVar.f156082h.f166637k, avVar.f156077c, avVar.f156083i, avVar.f156081g.mo22757K(), a, b, str, str2);
            C70005cr.m123611a().f156493m = RecordScene.containBusiSticker(avVar.f156083i.f155817b.f155650f);
            avVar.f156084j.mo116185a(new AbstractC73587b.C73588a(aVar));
            avVar.f156076b.mo110050b(false);
            avVar.f156081g.mo22753G();
            if (avVar.f156083i.mo110018b()) {
                ((AbstractC84089j) ApiCenter.C2545a.m7450a(avVar.f156080f).mo7013a(AbstractC84089j.class)).mo128898F().mo109783a();
                return;
            }
            return;
        }
        boolean exists = str != null ? new File(str).exists() : false;
        boolean exists2 = str2 != null ? new File(str2).exists() : false;
        File file = new File(avVar.f156083i.f155817b.f155652h.mo110096e() + "1_frag_v");
        C40982q.m82520a("aweme_concat_success_rate", 1, new C69840ar().mo110187a("errorCode", Integer.valueOf(i)).mo110189a("videoPath", str.toString()).mo110189a("audioPath", str2).mo110189a("videoFileExists", String.valueOf(exists)).mo110189a("audioFileExists", String.valueOf(exists2)).mo110189a("firstSegmentPath", String.valueOf(file.exists())).mo110189a("firstSegmentLength", String.valueOf(file.length())).mo110189a("hardEncode", String.valueOf(avVar.f156083i.f155817b.f155649e)).mo110185a("abParam", (Boolean) true).mo110191a());
        String string = avVar.f156080f.getString(R.string.ary, new Object[]{Integer.valueOf(i)});
        if ((i == -10021 || i == -2000) && avVar.f156080f != null) {
            string = avVar.f156080f.getString(R.string.b8k);
        }
        new C79459a(avVar.f156080f).mo123052a(string).mo123053a();
        avVar.f156076b.mo110050b(false);
        C80510gr.m139533a("record_error", "2", "concat failed , ve result = " + fVar.f176642d);
    }
}
