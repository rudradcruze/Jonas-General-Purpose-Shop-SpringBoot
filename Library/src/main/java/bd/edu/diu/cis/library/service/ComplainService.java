package bd.edu.diu.cis.library.service;

import bd.edu.diu.cis.library.model.Complain;

import java.util.List;

public interface ComplainService {
    List<Complain> listAll();
    Complain get(long id);
    void delete(long id);
    void updateStatus(long id);
    void save(Complain complain);
}
