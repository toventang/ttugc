package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.security.C32940d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.bullet.p2410ab.C34955a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53446g;
import com.p2082ss.android.ugc.aweme.p2756df.C41465a;
import com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63997au;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64174u;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.ProfileEditActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e;
import com.p2082ss.android.ugc.aweme.recommend.C66642o;
import com.p2082ss.android.ugc.aweme.recommend.C66643p;
import com.p2082ss.android.ugc.aweme.recommend.RecommendUserDialogTask;
import com.p2082ss.android.ugc.aweme.share.C68870am;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.BridgeServiceImpl */
public final class BridgeServiceImpl implements AbstractC63870e {
    static {
        Covode.recordClassIndex(79600);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void checkToTransformMusDraft() {
    }

    public final C64174u createUserProfileEditFragment() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final AbstractC34586a createMyProfileFragment() {
        return new C64208b();
    }

    public final AbstractC34586a createUserProfileFragment() {
        return new C64250i();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final boolean needShowSafeInfoNotice() {
        return C32940d.C32941a.m67579a();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void onFeedStop() {
        C53446g.C53447a.f122670a.f122664b = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final AbstractC63744f getBulletABHelper() {
        return (C34955a) C34955a.f82460a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final boolean shouldShowI18nRecommendUserDialogOnMyPrifile() {
        if (!C66642o.m118414c() || !RecommendUserDialogTask.f149735b.get() || !C66643p.m118416a()) {
            return false;
        }
        return true;
    }

    public final void setCustomStatusBarInLayout(Activity activity) {
        C34729o.m70953a(activity);
        C34729o.m70958b(activity);
    }

    public final void switchToSignature(Activity activity) {
        ProfileEditActivity.m115659a(activity, (Bundle) null);
    }

    public final void openWallet(Activity activity) {
        C89219l.m154721d(activity, "");
        C41465a.m83381a(activity, "page_index");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void enterMyFavorites(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        SmartRouter.buildRoute(activity, "//favorite").withParam(bundle).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void switchToBioUrl(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        SmartRouter.buildRoute(activity, "//profile/edit_bio").withParam("bio_url", str).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void startThirdSocialActivity(Context context, User user, int i) {
        String twitterId;
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        if (i == 1) {
            String insId = user.getInsId();
            if (insId != null && !insId.isEmpty()) {
                C89219l.m154721d(context, "");
                C89219l.m154721d(insId, "");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("instagram://user?username=".concat(String.valueOf(insId))));
                intent.setPackage("com.instagram.android");
                Intent intent2 = new Intent(context, CrossPlatformActivity.class);
                intent2.putExtra("title", context.getString(R.string.cmp));
                intent2.setData(Uri.parse("https://instagram.com/_u/".concat(String.valueOf(insId))));
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    C68870am.m121543a(context, intent2);
                    return;
                }
                try {
                    C68870am.m121543a(context, intent);
                } catch (ActivityNotFoundException unused) {
                    C68870am.m121543a(context, intent2);
                }
            }
        } else if (i == 2) {
            String youtubeChannelId = user.getYoutubeChannelId();
            if (youtubeChannelId != null && !youtubeChannelId.isEmpty()) {
                C89219l.m154721d(context, "");
                C89219l.m154721d(youtubeChannelId, "");
                Uri parse = Uri.parse("https://www.youtube.com/channel/".concat(String.valueOf(youtubeChannelId)));
                Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                intent3.setPackage("com.google.android.youtube");
                Intent intent4 = new Intent(context, CrossPlatformActivity.class);
                intent4.putExtra("title", context.getString(R.string.hcm));
                intent4.setData(parse);
                if (intent3.resolveActivity(context.getPackageManager()) == null) {
                    C68870am.m121543a(context, intent4);
                    return;
                }
                try {
                    C68870am.m121543a(context, intent3);
                } catch (ActivityNotFoundException unused2) {
                    C68870am.m121543a(context, intent4);
                }
            }
        } else if (i == 3 && (twitterId = user.getTwitterId()) != null && !twitterId.isEmpty()) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(twitterId, "");
            Intent intent5 = new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?id=".concat(String.valueOf(twitterId))));
            intent5.setPackage("com.twitter.android");
            Intent intent6 = new Intent(context, CrossPlatformActivity.class);
            intent6.putExtra("title", context.getString(R.string.gx5));
            intent6.setData(Uri.parse("https://twitter.com/intent/user?user_id=".concat(String.valueOf(twitterId))));
            if (intent5.resolveActivity(context.getPackageManager()) == null) {
                C68870am.m121543a(context, intent6);
                return;
            }
            try {
                C68870am.m121543a(context, intent5);
            } catch (ActivityNotFoundException unused3) {
                C68870am.m121543a(context, intent6);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final AbstractC63985aq createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3) {
        return C63997au.m115737a(i, i2, str, str2, z, z2, new Bundle());
    }
}
