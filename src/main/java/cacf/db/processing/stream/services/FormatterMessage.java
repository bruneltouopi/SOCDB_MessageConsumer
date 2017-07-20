package cacf.db.processing.stream.services;

import cacf.db.processing.stream.enums.Channel;

/**
 * Created by f.touopi.touopi on 7/19/2017.
 */
public class FormatterMessage {

    /**
     * Formatte a pivot message depending of the Channel
     * @param message
     * @return
     */
    public String formatMessage(String message, Channel channel){
        switch (channel){
            case CDC:
                break;
            case GANA_API:
                break;
        }
        return null;
    }
}
