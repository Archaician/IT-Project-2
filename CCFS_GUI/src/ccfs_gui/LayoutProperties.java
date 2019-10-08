/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ccfs_gui;

import javafx.scene.layout.AnchorPane;

/**
 *
 * @author @Imran
 * @version 1.0
 */
public class LayoutProperties {
        
        public static void anchorPaneConstraints(AnchorPane new_anchorpane) {
                AnchorPane.setTopAnchor(new_anchorpane, 0.0);
                AnchorPane.setRightAnchor(new_anchorpane, 0.0);
                AnchorPane.setLeftAnchor(new_anchorpane, 0.0);
                AnchorPane.setBottomAnchor(new_anchorpane, 0.0);
        }

}
