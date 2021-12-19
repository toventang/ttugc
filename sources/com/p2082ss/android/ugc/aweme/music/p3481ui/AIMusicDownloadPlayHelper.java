package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.music.ui.AIMusicDownloadPlayHelper */
public class AIMusicDownloadPlayHelper extends MusicDownloadPlayHelper implements AbstractC33974au {

    /* renamed from: a */
    private Toast f138576a;

    /* renamed from: b */
    private ArrayList<Integer> f138577b = new ArrayList<>();

    static {
        Covode.recordClassIndex(71674);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper
    /* renamed from: a */
    public final void mo98606a(MusicModel musicModel) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: d */
    public final void mo63045d() {
        Downloader instance = Downloader.getInstance(this.f138607c.mo62886i());
        if (!C13603b.m24435a((Collection) this.f138577b)) {
            Iterator<Integer> it = this.f138577b.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next != null) {
                    instance.cancel(next.intValue());
                }
            }
        }
        super.mo63045d();
    }

    public AIMusicDownloadPlayHelper(AbstractC61180m mVar) {
        super(mVar);
    }

    /* renamed from: a */
    private static void m110627a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    private void m110626a(Context context, String str) {
        Toast toast = this.f138576a;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, str, 0);
        this.f138576a = makeText;
        if (makeText != null) {
            makeText.setGravity(17, 0, 0);
            m110627a(this.f138576a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper
    /* renamed from: a */
    public final boolean mo63042a(MusicModel musicModel, Context context) {
        if (musicModel == null) {
            return true;
        }
        if (!musicModel.isPlayUrlValid()) {
            m110626a(context, context.getString(R.string.dav));
            return false;
        } else if (musicModel.getMusicStatus() != 0) {
            return true;
        } else {
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context.getString(R.string.dau);
            }
            m110626a(context, offlineDesc);
            return false;
        }
    }
}
