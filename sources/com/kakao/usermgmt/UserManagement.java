package com.kakao.usermgmt;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.auth.AuthService;
import com.kakao.auth.ISession;
import com.kakao.auth.Session;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.network.tasks.ITaskQueue;
import com.kakao.network.tasks.KakaoResultTask;
import com.kakao.network.tasks.KakaoTaskQueue;
import com.kakao.usermgmt.api.UserApi;
import com.kakao.usermgmt.callback.LogoutResponseCallback;
import com.kakao.usermgmt.callback.MeV2ResponseCallback;
import com.kakao.usermgmt.callback.UnLinkResponseCallback;
import com.kakao.usermgmt.response.AgeAuthResponse;
import com.kakao.usermgmt.response.MeV2Response;
import com.kakao.usermgmt.response.ServiceTermsResponse;
import com.kakao.usermgmt.response.ShippingAddressResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class UserManagement {
    private static UserManagement instance = new UserManagement(UserApi.getInstance(), KakaoTaskQueue.getInstance(), Session.getCurrentSession());
    public UserApi api;
    public ISession session;
    private ITaskQueue taskQueue;

    public enum AgeAuthProperty {
        ACCOUNT_CI("account_ci");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(34003);
        }

        private AgeAuthProperty(String str) {
            this.value = str;
        }
    }

    public static UserManagement getInstance() {
        return instance;
    }

    static {
        Covode.recordClassIndex(33991);
    }

    /* renamed from: me */
    public Future<MeV2Response> mo47840me(MeV2ResponseCallback meV2ResponseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<MeV2Response>(meV2ResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281185 */

            static {
                Covode.recordClassIndex(33998);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public MeV2Response call() {
                return UserManagement.this.api.mo47853me(null, true);
            }
        });
    }

    public void requestLogout(LogoutResponseCallback logoutResponseCallback) {
        this.taskQueue.addTask(new KakaoResultTask<Long>(logoutResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281152 */

            static {
                Covode.recordClassIndex(33995);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public Long call() {
                return UserManagement.this.api.requestLogout();
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public void onDidEnd() {
                super.onDidEnd();
                UserManagement.this.session.close();
            }
        });
    }

    public void requestUnlink(UnLinkResponseCallback unLinkResponseCallback) {
        this.taskQueue.addTask(new KakaoResultTask<Long>(unLinkResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281163 */

            static {
                Covode.recordClassIndex(33996);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public Long call() {
                return UserManagement.this.api.requestUnlink();
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public void onDidEnd() {
                super.onDidEnd();
                UserManagement.this.session.close();
            }
        });
    }

    public Future<ServiceTermsResponse> serviceTerms(ApiResponseCallback<ServiceTermsResponse> apiResponseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<ServiceTermsResponse>(apiResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281218 */

            static {
                Covode.recordClassIndex(34001);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public ServiceTermsResponse call() {
                return UserManagement.this.api.serviceTerms();
            }
        });
    }

    public Future<ShippingAddressResponse> shippingAddresses(ApiResponseCallback<ShippingAddressResponse> apiResponseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<ShippingAddressResponse>(apiResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281229 */

            static {
                Covode.recordClassIndex(34002);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public ShippingAddressResponse call() {
                return UserManagement.this.api.shippingAddresses(null, null, null);
            }
        });
    }

    public void requestSignup(ApiResponseCallback<Long> apiResponseCallback, final Map<String, String> map) {
        this.taskQueue.addTask(new KakaoResultTask<Long>(apiResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281121 */

            static {
                Covode.recordClassIndex(33992);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public Long call() {
                return UserManagement.this.api.requestSignup(map);
            }
        });
    }

    public void requestUpdateProfile(ApiResponseCallback<Long> apiResponseCallback, final Map<String, String> map) {
        this.taskQueue.addTask(new KakaoResultTask<Long>(apiResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281174 */

            static {
                Covode.recordClassIndex(33997);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public Long call() {
                return UserManagement.this.api.requestUpdateProfile(map);
            }
        });
    }

    /* renamed from: me */
    public Future<MeV2Response> mo47841me(final List<String> list, MeV2ResponseCallback meV2ResponseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<MeV2Response>(meV2ResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281196 */

            static {
                Covode.recordClassIndex(33999);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public MeV2Response call() {
                return UserManagement.this.api.mo47853me(list, true);
            }
        });
    }

    public Future<ShippingAddressResponse> shippingAddresses(final Long l, ApiResponseCallback<ShippingAddressResponse> apiResponseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<ShippingAddressResponse>(apiResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C2811310 */

            static {
                Covode.recordClassIndex(33993);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public ShippingAddressResponse call() {
                return UserManagement.this.api.shippingAddresses(l, null, null);
            }
        });
    }

    UserManagement(UserApi userApi, ITaskQueue iTaskQueue, ISession iSession) {
        this.api = userApi;
        this.taskQueue = iTaskQueue;
        this.session = iSession;
    }

    public Future<ShippingAddressResponse> shippingAddresses(final Integer num, final Integer num2, ApiResponseCallback<ShippingAddressResponse> apiResponseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<ShippingAddressResponse>(apiResponseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C2811411 */

            static {
                Covode.recordClassIndex(33994);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public ShippingAddressResponse call() {
                return UserManagement.this.api.shippingAddresses(null, num, num2);
            }
        });
    }

    public void requestAgeAuthInfo(ResponseCallback<AgeAuthResponse> responseCallback, final AuthService.AgeLimit ageLimit, List<AgeAuthProperty> list) {
        final ArrayList arrayList;
        if (list == null || list.size() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (AgeAuthProperty ageAuthProperty : list) {
                arrayList.add(ageAuthProperty.getValue());
            }
        }
        this.taskQueue.addTask(new KakaoResultTask<AgeAuthResponse>(responseCallback) {
            /* class com.kakao.usermgmt.UserManagement.C281207 */

            static {
                Covode.recordClassIndex(34000);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public AgeAuthResponse call() {
                return UserManagement.this.api.requestAgeAuthInfo(ageLimit, arrayList);
            }
        });
    }

    public void requestUpdateProfile(ApiResponseCallback<Long> apiResponseCallback, String str, String str2, String str3, Map<String, String> map) {
        Map<String, String> map2;
        if (map == null) {
            map2 = new HashMap<>();
        } else {
            map2 = map;
        }
        map.put("nickname", str);
        map.put("thumbnail_image", str2);
        map.put("profile_image", str3);
        requestUpdateProfile(apiResponseCallback, map2);
    }
}
