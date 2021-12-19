package com.p2082ss.android.ugc.aweme.services.publish;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.publish.IAVPublishExtension */
public interface IAVPublishExtension<T> {

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback */
    public interface Callback {
        static {
            Covode.recordClassIndex(79938);
        }

        void onContentModified();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$DefaultImpls */
    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79939);
        }

        public static <T> void callbackAnchors(IAVPublishExtension<T> iAVPublishExtension, List<CreateAnchorInfo> list) {
            C89219l.m154721d(list, "");
        }

        public static <T> UrlModel getAnchorIconUrl(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> ViewGroup getAnchorListContent(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> String getAnchorText(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> void onActivityResult(IAVPublishExtension<T> iAVPublishExtension, int i, int i2, Intent intent) {
        }

        public static <T> void onBackPressed(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            C89219l.m154721d(publishOutput, "");
        }

        public static <T> void onCreateFinish(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onPublish(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            C89219l.m154721d(publishOutput, "");
        }

        public static <T> void onRequestPermissionsResult(IAVPublishExtension<T> iAVPublishExtension, int i, String[] strArr, int[] iArr) {
            C89219l.m154721d(strArr, "");
            C89219l.m154721d(iArr, "");
        }

        public static <T> void onResume(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onSaveDraft(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
            C89219l.m154721d(publishOutput, "");
        }

        public static <T> void onSaveInstanceState(IAVPublishExtension<T> iAVPublishExtension, Bundle bundle) {
            C89219l.m154721d(bundle, "");
        }

        public static <T> void setLeftIcon(IAVPublishExtension<T> iAVPublishExtension, int i) {
        }

        public static <T> void setRightIcon(IAVPublishExtension<T> iAVPublishExtension, C22999a aVar) {
            C89219l.m154721d(aVar, "");
        }
    }

    static {
        Covode.recordClassIndex(79937);
    }

    void callbackAnchors(List<CreateAnchorInfo> list);

    UrlModel getAnchorIconUrl();

    ViewGroup getAnchorListContent();

    String getAnchorText();

    String getName();

    void onActivityResult(int i, int i2, Intent intent);

    void onBackPressed(PublishOutput publishOutput);

    void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback);

    void onCreateFinish();

    void onDestroy();

    void onEnterChildrenMode();

    void onPublish(PublishOutput publishOutput);

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onResume();

    void onSaveDraft(PublishOutput publishOutput);

    void onSaveInstanceState(Bundle bundle);

    T provideExtensionData();

    void setLeftIcon(int i);

    void setRightIcon(C22999a aVar);
}
