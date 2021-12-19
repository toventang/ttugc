package com.p2082ss.android.ugc.aweme.record;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p938a.C14117i;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.publish.C65504a;
import com.p2082ss.android.ugc.aweme.record.AbstractC66812f;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.vesdk.C85515j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.record.d */
public interface AbstractC66810d {
    static {
        Covode.recordClassIndex(78382);
    }

    void addStoryTempFile(String str);

    void attachStickerComponent(C2551b bVar, AbstractC22186b bVar2, int i, C75972r.AbstractC75974b bVar3);

    void cleanStoryCache();

    AbstractC22219j createLighteningFakeScene();

    boolean enable3MinRecord();

    Activity findActivityInstance(Class<? extends ActivityC0945e> cls);

    C14117i generateBeautyComponent(C21582f fVar);

    AbstractC66809c getABService();

    AbstractC14318d getARGestureDelegateListener(AbstractC31193a aVar, ViewGroup.MarginLayoutParams marginLayoutParams);

    AbstractC66808b getAlbumService();

    String getDefaultShootTabTag(ShortVideoContext shortVideoContext);

    AbstractC66811e getMaxDurationResolver();

    AbstractC66812f getPhotoModule(ActivityC0945e eVar, AbstractC31133a aVar, AbstractC66812f.AbstractC66813a aVar2);

    boolean getRequestDuetSettingPermission();

    void initVESDK(C85515j jVar);

    boolean isRecordingOrEditing();

    void photoCanvasGoNext(ActivityC0945e eVar, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, MediaModel mediaModel, AbstractC89172b<? super Boolean, C89391z> bVar);

    void registerNeededObjects(ActivityC0945e eVar, C21597n nVar, ShortVideoContext shortVideoContext);

    void requestDuetSettingPermission();

    boolean shouldDropCurrentMusicFor3min(Object obj, ShortVideoContext shortVideoContext);

    void startStoryPublish(Activity activity, AbstractC31071f fVar, AbstractC72510a aVar, C65504a aVar2, Intent intent);
}
