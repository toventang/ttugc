package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.model.AbstractC9514aa;
import com.bytedance.android.livesdkapi.depend.AbstractC11622a;
import com.bytedance.android.livesdkapi.depend.AbstractC11624b;
import com.bytedance.android.livesdkapi.host.p694b.AbstractC11798a;
import com.bytedance.android.livesdkapi.p691g.AbstractC11763d;
import com.bytedance.android.livesdkapi.p691g.AbstractC11764e;
import com.bytedance.android.livesdkapi.view.AbstractC11872a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;

public interface IHostApp extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostApp$a */
    public static class C11789a {

        /* renamed from: a */
        public String f28169a;

        /* renamed from: b */
        public String f28170b;

        /* renamed from: c */
        public String f28171c;

        /* renamed from: d */
        public String f28172d;

        /* renamed from: e */
        public Map<String, String> f28173e = new HashMap(3);

        static {
            Covode.recordClassIndex(13481);
        }
    }

    static {
        Covode.recordClassIndex(13480);
    }

    AbstractC11763d avatarBorderController();

    void bindGifImage(View view, String str, Bitmap.Config config);

    void checkAndShowGuide(ActivityC0945e eVar, String str, String str2);

    void checkBindHelpShow(ActivityC0945e eVar, String str);

    void enterRecorderActivity(Activity activity);

    String getBgBroadcastServiceName();

    Pair<String, Drawable> getBreathShareAnimShareRes(Context context, String str, String str2);

    int getCurrentPage();

    Class getHostActivity(int i);

    Typeface getHostTypeface(int i);

    List<Class> getLiveActivityClass();

    boolean getPushLiveState();

    Activity getTopActivity();

    Uri getUriForFile(Context context, File file);

    void hideStickerView();

    void initImageLib();

    boolean isAppForeground();

    boolean isInMusicallyRegion();

    boolean isNotificationEnabled(Context context);

    boolean isShowStickerView();

    void jumpToAgsStatusPage(Context context, String str);

    AbstractC11764e liveCircleView(Context context);

    void openWallet(Activity activity);

    AbstractC88412b registerAppEnterForeBackgroundCallback(AbstractC11622a aVar);

    void registerLifeCycleCallback(AbstractC11624b bVar);

    void setCurrentPage(int i);

    Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, AbstractC11872a aVar, CharSequence charSequence4, AbstractC11872a aVar2, AbstractC11798a aVar3);

    void showNotificationTipDialog(String str, String str2, String str3, int i, View view, String str4, C11789a aVar, boolean z, AbstractC9514aa aaVar);

    void showStickerView(ActivityC0218d dVar, AbstractC0952i iVar, String str, FrameLayout frameLayout, AbstractC11819n nVar);

    void startBindMobileFullFragment(Activity activity, String str, String str2, AbstractC11818m mVar);

    void startBindPhoneDialogFragment(Activity activity, String str, String str2, AbstractC11818m mVar);

    boolean startVideoRecordActivity(Activity activity, String str);

    void transCloudControlCommand(JSONObject jSONObject);

    void tryDownloadGiftImage(String str);

    void tryDownloadImage(String str);
}
