package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public interface ByteAudioSinkInterface {

    public interface ByteAudioAuxSink {
        static {
            Covode.recordClassIndex(14987);
        }

        void onMixingBegin(ByteAudioAuxStream byteAudioAuxStream);

        void onMixingEnd(ByteAudioAuxStream byteAudioAuxStream);

        int onPullAudioBufferToAuxStream(ByteAudioAuxStream byteAudioAuxStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioFilterSink {
        static {
            Covode.recordClassIndex(14988);
        }

        int onProcess(ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioInputSink {
        static {
            Covode.recordClassIndex(14989);
        }

        int onPushAudioBufferFromStream(ByteAudioInputStream byteAudioInputStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioOutputSink {
        static {
            Covode.recordClassIndex(14990);
        }

        int onPullAudioBufferToStream(ByteAudioOutputStream byteAudioOutputStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    static {
        Covode.recordClassIndex(14986);
    }
}
