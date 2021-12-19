package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15407j;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.utils.C80212ag;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.File;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.j */
final /* synthetic */ class C81612j implements AbstractC1729g {

    /* renamed from: a */
    private final C81609h f182506a;

    /* renamed from: b */
    private final int f182507b;

    static {
        Covode.recordClassIndex(95009);
    }

    C81612j(C81609h hVar, int i) {
        this.f182506a = hVar;
        this.f182507b = i;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        Bitmap.CompressFormat compressFormat;
        String str;
        C81609h hVar = this.f182506a;
        int i = this.f182507b;
        Object obj = "";
        if (iVar.mo5545d() == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            jSONObject.put("file_path", obj);
            return jSONObject;
        }
        if (i == 1) {
            compressFormat = Bitmap.CompressFormat.PNG;
            str = ".png";
        } else if (i != 2) {
            compressFormat = Bitmap.CompressFormat.JPEG;
            str = ".jpg";
        } else {
            compressFormat = Bitmap.CompressFormat.WEBP;
            str = ".webp";
        }
        Context context = hVar.f182497a.get();
        if (context == null) {
            return null;
        }
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        File file = new File(C58016d.f132222c.getAbsolutePath() + File.separator + C15407j.f37618b, "share_" + System.currentTimeMillis() + str);
        C80313cs.m139225a(file.getAbsolutePath(), true);
        boolean a = C80212ag.m139040a((Bitmap) iVar.mo5545d(), file, 100, compressFormat);
        ((Bitmap) iVar.mo5545d()).recycle();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", a ? 1 : 0);
        if (a) {
            obj = file.getAbsoluteFile();
        }
        jSONObject2.put("file_path", obj);
        return jSONObject2;
    }
}
