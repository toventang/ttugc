package com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength;

import android.app.Activity;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker */
public interface IVideoLengthChecker {
    static {
        Covode.recordClassIndex(84064);
    }

    /* renamed from: a */
    void mo113255a(Activity activity, VideoPublishEditModel videoPublishEditModel);

    /* renamed from: a */
    void mo113256a(Activity activity, VideoPublishEditModel videoPublishEditModel, AbstractC82561d dVar);

    /* renamed from: a */
    void mo113257a(VideoPublishEditModel videoPublishEditModel, AbstractC72510a aVar, AbstractC1204m mVar, EditToolbarViewModel editToolbarViewModel);

    /* renamed from: a */
    void mo113258a(AbstractC72510a aVar, AbstractC1204m mVar, FTCEditToolbarViewModel fTCEditToolbarViewModel);
}
