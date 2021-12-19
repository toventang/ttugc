package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.v */
final /* synthetic */ class C7221v implements AbstractC88983w {

    /* renamed from: a */
    private final C7206t f17983a;

    /* renamed from: b */
    private final Uri f17984b;

    static {
        Covode.recordClassIndex(7967);
    }

    C7221v(C7206t tVar, Uri uri) {
        this.f17983a = tVar;
        this.f17984b = uri;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        String str;
        C7206t tVar = this.f17983a;
        Uri uri = this.f17984b;
        try {
            Context context = tVar.f17938c.getContext();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(context, uri);
            str = "";
            if (BitmapUtils.saveBitmapToSD(mediaMetadataRetriever.getFrameAtTime(), tVar.f17936a, "firstFrame.temp")) {
                try {
                    str = tVar.f17936a + File.separator + "firstFrame.temp";
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            str = null;
        }
        vVar.mo143031a(str);
    }
}
