package uk.ac.bbsrc.tgac.miso.service;

import uk.ac.bbsrc.tgac.miso.core.data.Barcodable;
import uk.ac.bbsrc.tgac.miso.core.data.impl.view.BarcodableView;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface BarcodableViewService {
  List<BarcodableView> searchByBarcode(String barcode);

  List<BarcodableView> searchByBarcode(String barcode, Collection<Barcodable.EntityType> typeFilter);

  <T extends Barcodable> T getEntity(BarcodableView view) throws IOException;
}
