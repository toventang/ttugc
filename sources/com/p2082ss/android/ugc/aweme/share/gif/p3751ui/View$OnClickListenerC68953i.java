package com.p2082ss.android.ugc.aweme.share.gif.p3751ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.FileProvider;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.metrics.C59212ag;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.i */
final /* synthetic */ class View$OnClickListenerC68953i implements View.OnClickListener {

    /* renamed from: a */
    private final VideoShare2GifPreviewActivity f154259a;

    /* renamed from: b */
    private final AbstractC69581b f154260b;

    /* renamed from: c */
    private final String f154261c;

    static {
        Covode.recordClassIndex(81265);
    }

    View$OnClickListenerC68953i(VideoShare2GifPreviewActivity videoShare2GifPreviewActivity, AbstractC69581b bVar, String str) {
        this.f154259a = videoShare2GifPreviewActivity;
        this.f154260b = bVar;
        this.f154261c = str;
    }

    public final void onClick(View view) {
        Uri fromFile;
        ClickAgent.onClick(view);
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = this.f154259a;
        AbstractC69581b bVar = this.f154260b;
        String str = this.f154261c;
        C39162r.m79461a("share_as_gif", new C39163s().mo67941a("group_id", videoShare2GifPreviewActivity.f154247d.f154193b).mo67941a("author_id", videoShare2GifPreviewActivity.f154247d.f154207p).mo67941a("enter_from", videoShare2GifPreviewActivity.f154247d.f154208q).mo67941a("log_pb", videoShare2GifPreviewActivity.f154247d.f154209r).mo67941a("platform", bVar.mo109548a()).mo67942a());
        C59212ag agVar = new C59212ag();
        agVar.f134815a = videoShare2GifPreviewActivity.f154247d.f154193b;
        agVar.f134841b = videoShare2GifPreviewActivity.f154247d.f154207p;
        C59212ag a = agVar.mo96751a(videoShare2GifPreviewActivity.f154247d.f154208q);
        a.f134842c = bVar.mo109548a();
        a.f134814Z = "gif_form";
        a.mo96792f();
        File file = new File(videoShare2GifPreviewActivity.f154247d.f154196e);
        if (Build.VERSION.SDK_INT >= 24) {
            fromFile = FileProvider.getUriForFile(videoShare2GifPreviewActivity, videoShare2GifPreviewActivity.getPackageName() + ".fileprovider", file);
        } else {
            fromFile = Uri.fromFile(file);
        }
        if (TextUtils.equals(str, "facebook")) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("video/*");
            intent.setClassName(videoShare2GifPreviewActivity.getPackageName(), "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias");
            intent.putExtra("android.intent.extra.STREAM", fromFile);
            Intent createChooser = Intent.createChooser(Intent.createChooser(intent, ""), "");
            C84349a.m145093a(createChooser, videoShare2GifPreviewActivity);
            videoShare2GifPreviewActivity.startActivity(createChooser);
        } else {
            bVar.mo109550a(new C69651l(fromFile, videoShare2GifPreviewActivity.f154247d.f154196e), (Context) videoShare2GifPreviewActivity);
        }
        videoShare2GifPreviewActivity.f154248e = true;
    }
}
